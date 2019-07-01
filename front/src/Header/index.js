import React, {Component} from 'react';
import {inject, observer} from "mobx-react";
import {Link} from "react-router-dom";

@inject('stores')
@observer
class Header extends Component {
    state={
        login: "로그인",
    };
    render() {
        if(this.props.stores.UserStore.user && this.state.login === '로그인'){
            this.setState({login: "로그아웃"});
        }
        return (
            <div>
                <p><Link to={`/cart`}>장바구니</Link></p>
                <p><Link to={`/user`}>{this.state.login}</Link></p>
            </div>
        );
    }
}

export default Header;