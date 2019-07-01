import React, {Component} from 'react';
import JoinView from "./JoinView";
import LoginView from "./LoginView";



class User extends Component {
    render() {
        if(this.props.match && this.props.match.params.command === 'join')
            return <JoinView/>;
        return (
            <div>
                <LoginView/>
            </div>
        );
    }
}

export default User;