import React from "react";
import dragula from "react-dragula";
import { connect } from 'react-redux'

import SetVarScriptElement from "./SetVarScriptElement"
import $ from 'jquery';

class Playground extends React.Component {
    render() {
        return <div className="playground">

            <div className="wrapper">
                <div className="column">
                    <div id="container-from" className="column-scroller">
                        <div className="elem container-elem">
                            element kontenerowy
                            <div className="nested"></div>
                        </div>
                        <SetVarScriptElement varName={"abc"}/>
                    </div>
                </div>
                <div className="column">
                    <div id="container-to" className="column-scroller">
                        <div className="elem">inny element</div>
                    </div>
                </div>
            </div>
        </div>;
    }

    componentDidMount() {
        dragula([].slice.apply(document.querySelectorAll('.nested')).concat([document.getElementById('container-from'),document.getElementById('container-to')]),{
            copy: function (el, source) {
                console.log(el,source);
                return source.id ==='container-from';
            },
            accepts: function (el, target) {
                console.log(el,target);
                return $(target).closest('#container-from').length ===0;
            }

        }).on('drop', function (el) {
            var nestedChildren = $(el).children('.nested');
            if( nestedChildren.length> 0 && $(el).closest('#container-to').length ===1){
                [].forEach.call(nestedChildren.filter((i,c) => this.containers.indexOf(c) === -1), c=>this.containers.push(c));
            }
            console.log('dropped', el);
        });

    }
}
export default Playground;