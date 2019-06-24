import React, {Component} from 'react';
import {inject, observer} from "mobx-react";
import CategoryList from "./CategoryList";

@inject('stores')
@observer
class Category extends Component {
    state={
        sub: false
    };

    componentDidMount() {
        this.props.stores.CategoryStore.fetchMainItem();
    }

    render() {
        let c = this.props.stores.CategoryStore;
        return (
            <div>
                {c.mainCategory && <CategoryList items={c.mainCategory}/>}
            </div>
        );
    }
}

export default Category;