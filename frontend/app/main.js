import React from "react";
import ReactDOM from "react-dom";

import {Router, Route, IndexRoute, hashHistory as history} from "react-router";
import MainLayout from "./components/MainLayout";
import MainPage from "./components/MainPage";
import GamePage from "./components/GamePage";
import WelcomePage from "./components/WelcomePage";
import Playground from "./components/Playground";


/*import {Provider} from "react-redux";
import store from "./store";
import routes from "./routes";*/
/**
 * Import all page components here
 */
ReactDOM.render(
    <Router history={history}>
        <Route path="/" component={MainLayout}>
            <IndexRoute component={MainPage}/>
            <Route path="welcome" component={WelcomePage}/>
            <Route path="game" component={GamePage}/>
            <Route path="playground" component={Playground}/>
        </Route>
    </Router>
   /* <div>
        cos
        <Provider store={store}>
            {routes}
        </Provider></div>*/, document.getElementById('root')
    )
