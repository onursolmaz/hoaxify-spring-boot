import React from 'react';
import UserList from "../components/UserList";
<<<<<<< HEAD
import HoaxSubmit from "../components/HoaxSubmit";
=======
import TweetSubmit from "../components/TweetSubmit";
>>>>>>> d41ad07... developed like system
import TweetFeed from "../components/TweetFeed";
import {useSelector} from "react-redux";

const HomePage = () => {

    const {isLoggedIn}=useSelector((store)=>({isLoggedIn:store.isLoggedIn}))
    return (
        <div className="container">

            <div className="row">
                <div className="col-6">
                    <div className="mb-2">
<<<<<<< HEAD
                        {isLoggedIn && <HoaxSubmit/>}
=======
                        {isLoggedIn && <TweetSubmit/>}
>>>>>>> d41ad07... developed like system
                    </div>
                        <TweetFeed/>
                </div>
                <div className="col-4 ml-auto">
                    <UserList/>
                </div>


            </div>


        </div>
    );
};

export default HomePage;