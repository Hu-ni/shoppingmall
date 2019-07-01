import React, {Component} from 'react';
import {inject, observer} from "mobx-react";
import CategoryList from "./CategoryList";

@inject('stores')
@observer
class Category extends Component {
    state={
        display: "none"
    };

    componentDidMount() {
        this.props.stores.CategoryStore.fetchMainItem();
    }


    render() {
        let c = this.props.stores.CategoryStore;
        return (
            <div>
                <ul className={'menu-bar'}>
                    <CategoryList items={c.mainCategory}/>
                </ul>
                <br/>
                <br/>
                <ul className={'menu-bar'}>
                    <CategoryList items={c.subCategory}/>
                </ul>
            </div>
        );
    }
}

export default Category;