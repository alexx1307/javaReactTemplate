import React from 'react';

class Player extends React.Component {
    render() {
        return (<tr>
            <td>{this.props.player.name}</td>
            <td>{this.props.player.age}</td>
            <td>{this.props.player.skills}</td>
        </tr>);
    }
}

export default Player;
