import {action, observable} from "mobx";
import axios from 'axios';

class CategoryStore{
    static __instance = null;
    static getInstance() {
        if(CategoryStore.__instance == null)
            CategoryStore.__instance = new CategoryStore();
        return CategoryStore.__instance;
    }
    constructor(){
        CategoryStore.__instance = this;
    }

    @observable mainCategory = null;
    @action fetchMainItem = async () => {
        try {
            this.mainCategory = null;
            let response = await axios({
                url: `http://localhost:8080/category/find`,
                method: 'get',
                header: {
                    'Content-type': 'application/json; charset=UTF-8'
                },
                timeout: 3000
            });
            console.log(response);
            if(response.status === 200){
                this.mainCategory = response.data;
                return true;
            }else return false;
        }catch (e) {
            alert(e.toLocaleString());
            return false;
        }
    };

    @observable subCategory = null;
    @action fetchSubItem = async (parent) => {
        try {
            this.subCategory = null;
            let response = await axios({
                url: `http://localhost:8080/category/find/${parent}`,
                method: 'get',
                header: {
                    'Content-type': 'application/json; charset=UTF-8'
                },
                timeout: 3000
            });
            console.log(response);
            if(response.status === 200){
                this.subCategory = response.data;
                return true;
            }else return false;
        }catch (e) {
            alert(e.toLocaleString());
            return false;
        }
    };

    @action add = async (c) => {
        try {
            let response = await axios({
                url: `http://localhost:8080/category/add`,
                method: 'post',
                headers: {
                    'Content-type': 'application/json; charset=UTF-8'
                },
                data: JSON.stringify(c),
                timeout: 3000
            });
            console.log(response);
            return (response.status === 200);
        }catch (e) {
            alert(e.toLocaleString());
        }
    };

    @action modify = async (c) => {
        try {
            let response = await axios({
                url: `http://localhost:8080/category/edit`,
                method: 'put',
                header: {
                    'Content-type': 'application/json; charset=UTF-8'
                },
                data: JSON.stringify(c),
                timeout: 3000
            });
            console.log(response);
            return (response.status === 200);
        }catch (e) {
            alert(e.toLocaleString());
        }
    };

    @action delete = async (id) => {
        try {
            let response = await axios({
                url: `http://localhost:8080/category/delete/${id}`,
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

export default CategoryStore.getInstance();