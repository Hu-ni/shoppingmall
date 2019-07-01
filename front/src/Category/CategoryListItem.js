import React,{Component} from 'react';
import {Link} from "react-router-dom";
import {inject, observer} from "mobx-react";

@inject("stores")
@observer
class CategoryListItem extends Component{

    mouseOver = () => {
        this.props.stores.CategoryStore.fetchSubItem(this.props.item.id);
    };

    mouseOut = () => {
    };

    render(){
        let item = this.props.item;
        if(item.parent)
            return(
                <li>
                    <Link to={`/`}>{this.props.item.name}</Link>
                </li>
            );
        return(
            <li onMouseOver={this.mouseOver} onMouseOut={this.mouseOut}><Link to={`/`}>{this.props.item.name}</Link></li>

        );
    }
}

export default CategoryListItem;