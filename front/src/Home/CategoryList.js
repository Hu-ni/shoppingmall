import React from "react";
import CategoryListItem from "./CategoryListItem";

const CategoryList = (props) =>{
    return(
        <div>
            <ul className="menu-bar">
                {props.items.map(category =>
                    <CategoryListItem key={category.id} item={category}/>)}
            </ul>
        </div>
    );
};

export default CategoryList;