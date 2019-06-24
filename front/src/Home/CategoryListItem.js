import React from 'react';
import {Link} from "react-router-dom";

const CategoryListItem = (props) =>{

    return(
        <li><Link to={`/`}>{props.item.name}</Link></li>
    )
};

export default CategoryListItem;
//
// import React, {Component} from 'react';
//
// class CategoryListItem extends Component {
//
//     componentDidMount() {
//         console.log(this.props);
//     }
//
//     render() {
//         return (
//             <div>
//
//             </div>
//         );
//     }
// }
//
// export default CategoryListItem;