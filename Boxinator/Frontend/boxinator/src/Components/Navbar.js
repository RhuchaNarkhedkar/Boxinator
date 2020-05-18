import React from 'react';
import '../styles.css';
import { NavLink } from 'react-router-dom';

const Navbar = () => {
    return (
        <header>
            <div className="container">

                <h1 className="app-logo">Boxinator</h1>

                <nav>
                    <ul className="nav-list">
                        <li><NavLink to="/addbox">Add</NavLink></li>
                        <li><NavLink to="/listboxes">Show</NavLink></li>
                    </ul>
                </nav>

            </div>

        </header>
    )
}

export default Navbar;