import React from 'react';
import {Navbar, Nav, NavItem} from 'react-bootstrap';
import {LinkContainer} from 'react-router-bootstrap'
import {Link} from 'react-router'

class MainLayout extends React.Component {
    render() {
        return (<div>
            <Navbar fixedTop fluid>
                <Navbar.Header>
                    <Navbar.Brand>MY FM</Navbar.Brand>
                    <Navbar.Toggle />
                </Navbar.Header>
                <Navbar.Collapse>
                    <Nav>
                        <LinkContainer to="/welcome"><NavItem>Start</NavItem></LinkContainer>
                        <LinkContainer to="/game"><NavItem>Game</NavItem></LinkContainer>
                        <LinkContainer to="/playground"><NavItem>Playground</NavItem></LinkContainer>
                    </Nav>
                </Navbar.Collapse>
            </Navbar>
            <div>{this.props.children}</div>
            <footer className="primary-footer">foot</footer>
        </div>);
    }
}

export default MainLayout;