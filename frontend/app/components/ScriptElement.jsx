import React from "react";
import {Panel} from 'react-bootstrap';


const ScriptElement=({title, children}) => (
    <Panel className="elem" header={title} >
        {children}
    </Panel>
)
export default ScriptElement;