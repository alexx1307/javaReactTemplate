import React from 'react';
import TeamTable from './TeamTable.jsx';
import $ from 'jquery';

class GamePage extends React.Component {

    constructor(props) {
        super(props);
        this.state = {players: []};
    }

    loadPlayersFromServer() {
        var self = this;

        $.ajax({
            url: "http://localhost:8090/api/players"
        }).done((data) => {
            console.log(data);
            self.setState({players: data._embedded.players});
        }).fail( () => alert("Loading player data FAILED."));
    }

    componentDidMount() {
        console.log('component did mount');
        this.loadPlayersFromServer();
        console.log('players loaded from server');
    }

    render() {
        return (<div>
            <div>WIDOK GRY</div>
            <TeamTable players={this.state.players}/>
        </div>);
    }
}

export default GamePage;