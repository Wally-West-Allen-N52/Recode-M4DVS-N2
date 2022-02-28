// Import components
import React, { Component } from "react";
export default class Header extends Component{
    render () {
        return (
            <header style={style.header}> {/* Call the variable style */}
                <h1>{this.props.title}</h1> {/* Call the "titlle" from "INDEX.HTML" */}
            </header>
        );
    }
}


// Arroow function sast "edf" 
// export default (params) => {

// }

// Create a object style
const style = {
    header: {
        height: '150px',
        background: '#fd8d33',
        padding: '30px',
        display: 'flex',
        alignItems: 'flex-end',
    }
}