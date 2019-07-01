import React from "react";
import CategoryListItem from "./CategoryListItem";

const CategoryList = (props) =>{
    return(
        <div>
            {props.items && props.items.map(item => <CategoryListItem key={item.id} item={item}/>)}
        </div>
    );
};

export default CategoryList;