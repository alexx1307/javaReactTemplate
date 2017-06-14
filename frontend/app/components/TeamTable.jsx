import React from 'react';
import Player from './Player.jsx';
import { Table } from 'react-bootstrap';
class TeamTable extends React.Component {
    render() {
        var rows = [];
        this.props.players.forEach(player => rows.push(<Player player={player}/>));
        return (<Table striped>
                    <thead>
                    <tr>
                        <th>name</th>
                        <th>age</th>
                        <th>skills</th>
                    </tr>
                    </thead>
                    <tbody>{rows}</tbody>
                </Table>);
    }
}

export default TeamTable;