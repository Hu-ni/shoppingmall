import React, {Component} from 'react';
import {inject} from "mobx-react";
import {Redirect} from "react-router-dom";

@inject("stores")

class JoinView extends Component {
    state ={
        id: '',
        password: '',
        confirmPassword: '',
        name: '',
        homeNumber: '',
        phoneNumber: '',
        postNumber: '',
        locate: '',
        email: '',
        goToHome: false
    };

    handleChange = (e) =>{
        this.setState({
            [e.target.name]: e.target.value
        });
    };

    handleJoin = (e) => {
        console.log("in");

        if(e.target.innerHTML ==='동의함'){
            console.log(this.props.stores.UserStore.add(this.state));
        }
        console.log(e.target.innerHTML);
        this.setState({
            goToHome: true
        })
        console.log("out");

    };

    render() {
        if(this.state.goToHome)
            return <Redirect to={`/`}/>
        return (
            <div>
                <div>
                    희망아이디: <input name="id" onChange={this.handleChange}/>
                </div>
                <div>
                    희망패스워드: <input name="password" type="password" onChange={this.handleChange}/>

                </div>
                <div>
                    패스워드확인: <input name="confirmPassword" type="password" onChange={this.handleChange}/>
                </div>
                <div>
                    성명: <input name="name" onChange={this.handleChange}/>
                </div>
                <div>
                    전화번호: <input name="homeNumber" onChange={this.handleChange}/>
                </div>
                <div>
                    핸드폰: <input name="phoneNumber" onChange={this.handleChange}/>
                </div>
                <div>
                    우편번호: <input name="postNumber" onChange={this.handleChange}/>
                </div>
                <div>
                    주소: <input name="locate" onChange={this.handleChange}/>
                </div>
                <div>
                    이메일 주소: <input name="email" onChange={this.handleChange}/>
                </div>
                <div>
                    회원약관
                    <div>
                        <textarea/>
                    </div>
                </div>
                <div>
                    회원약관에 <button onClick={this.handleJoin}>동의함</button><button>동의안함</button>
                </div>
            </div>
        );
    }
}

export default JoinView;