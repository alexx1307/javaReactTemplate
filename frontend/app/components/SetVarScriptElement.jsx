import React from "react";
import ScriptElement from "./ScriptElement"
import {Form, FormControl, ControlLabel} from "react-bootstrap"

const SetVarScriptElement=({varName}) => (
    <ScriptElement title="Set variable">
        <Form>
            <ControlLabel>Var name</ControlLabel>
            <FormControl componentClass="select" >
                <option hidden selected>choose an variable</option>
                <option value="var1">var1</option>
                <option value="var2">var2</option>
            </FormControl>
        </Form>
    </ScriptElement>
)
export default SetVarScriptElement;