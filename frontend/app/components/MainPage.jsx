import React from 'react';
import {Link} from 'react-router'

class MainPage extends React.Component {
    render() {
        return (<div>
            <div><h1>Główna strona</h1></div>
            <div><Link to="game">idz do gry</Link></div>
            <div><Link to="welcome">idz do startu</Link></div>
            <div><Link to="playground">playground</Link></div>
        </div>);
    }
}

export default MainPage