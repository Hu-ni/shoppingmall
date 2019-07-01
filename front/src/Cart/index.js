import React, {Component} from 'react';
import {inject, observer} from "mobx-react";
import {Redirect} from "react-router-dom";

@inject('stores')
@observer
class Cart extends Component {
    render() {
        if(this.props.UserStore.user === null)
            return <Redirect to={'/user'}/>;
        return (
            <div>

            </div>
        );
    }
}

export default Cart;