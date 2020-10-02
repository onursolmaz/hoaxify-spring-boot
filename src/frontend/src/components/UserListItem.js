import React from 'react';
import {Link} from "react-router-dom";
import ProfilePictureWithDefault from "./ProfilePictureWithDefault";

const UserListItem = (props) => {
    const {user}=props
    const {username,displayName,image}=user
    return (
<<<<<<< HEAD
        <Link to={"/user/"+user.username} className="list-group-item list-group-item-action font-weight-bolder">
=======
        <Link to={"/users/"+user.username} className="list-group-item list-group-item-action font-weight-bolder">
>>>>>>> d41ad07... developed like system
            <ProfilePictureWithDefault className="rounded-circle mr-2" width="35px" height="35px" image={image} alt={user.username+"profile"}/>
            {displayName} <span className="font-weight-lighter"> @{username}</span>
        </Link>
    );
};

export default UserListItem;