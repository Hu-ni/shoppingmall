import React, {Component} from 'react';
import {Redirect} from "react-router-dom";
import {inject, observer} from "mobx-react";

@inject("stores")
@observer
class LoginView extends Component {
    state = {
        id: '',
        password: '',
        goToHome: false,
        goToJoin: false,
    };

    handleChange = (e) =>{
        this.setState({
            [e.target.name]: e.target.value
        });
    };

    handleClick = (e) =>{
        if(e.target.innerHTML === '회원가입')
            this.setState({goToJoin: true});
        else{
            this.setState({goToHome:this.props.stores.UserStore.login(this.state)});
        }
    };

    render() {
        if(this.state.goToHome)
            return <Redirect to={`/`}/>;
        if(this.state.goToJoin)
            return <Redirect to={`/user/join`}/>;
        return (
            <div>
                <div>
                    <input name="id" onChange={this.handleChange}/>
                </div>
                <div>
                    <input name="password" type="password" onChange={this.handleChange}/>
                </div>
                <button onClick={this.handleClick}>로그인</button><button onClick={this.handleClick}>회원가입</button>
            </div>
        );
    }
}

export default LoginView;