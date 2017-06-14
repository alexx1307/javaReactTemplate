import React from "react";
import {Router, Route, IndexRoute, hashHistory as history} from "react-router";
import MainLayout from "./components/MainLayout";
import MainPage from "./components/MainPage";
import GamePage from "./components/GamePage";
import WelcomePage from "./components/WelcomePage";
import Playground from "./components/Playground";
/**
 * Import all page components here
 */

const routes = ({})=>
(<Router history={history}>
    <Route path="/" component={MainLayout}>
    <IndexRoute component={MainPage}/>
    <Route path="welcome" component={WelcomePage}/>
    <Route path="game" component={GamePage}/>
    <Route path="playground" component={Playground}/>
    </Route>
    </Router>)

export default routes