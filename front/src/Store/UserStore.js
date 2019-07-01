import {action, observable} from "mobx";
import axios from 'axios';

class UserStore{
    static __instance = null;
    static getInstance() {
        if(UserStore.__instance == null)
            UserStore.__instance = new UserStore();
        return UserStore.__instance;
    }
    constructor(){
        UserStore.__instance = this;
    }

    @observable user = null;
    @action login = async (u) => {
        try {
            this.user = null;
            let response = await axios({
                url: `http://localhost:8080/user/find?id=${u.id}&pw=${u.password}`,
                method: 'get',
                headers: {
                    'Content-type': 'application/json; charset=UTF-8',
                },
                data: JSON.stringify(u),
                timeout: 3000
            })
            console.log(response);
            if(response.status === 200){
                this.user = response.data;
                return true;
            }else return false;
        }catch (e) {
            alert(e.toLocaleString());
            return false;
        }
    };

    @action add = async (u) => {
        try {
            let response = await axios({
                url: `http://localhost:8080/user/add`,
                method: 'post',
                headers: {
                    'Content-type': 'application/json; charset=UTF-8'
                },
                data: JSON.stringify(u),
                timeout: 3000
            });
            console.log(response);
            return (response.status === 200);
        }catch (e) {
            alert(e.toLocaleString());
        }
    };

    @action modify = async (u) => {
        try {
            let response = await axios({
                url: `http://localhost:8080/user/edit`,
                method: 'put',
                header: {
                    'Content-type': 'application/json; charset=UTF-8'
                },
                data: JSON.stringify(u),
                timeout: 3000
            });
            console.log(response);
            return (response.status === 200);
        }catch (e) {
            alert(e.toLocaleString());
        }
    };

    @action delete = async (seq) => {
        try {
            let response = await axios({
                url: `http://localhost:8080/user/delete/${seq}`,
                method: 'delete',
                header: {
                    'Content-type': 'application/json; charset=UTF-8'
                },
                timeout: 3000
            });
            console.log(response);
            return (response.status === 200);
        }catch (e) {
            alert(e.toLocaleString());
        }
    }
}

export default UserStore.getInstance();