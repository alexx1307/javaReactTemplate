/**
 * Created by lukas on 13.06.2017.
 */
export default function reducer(state={
    varName: '',
    from: null,
    inputValue: null
},action){
    switch(action.type){
        case "SET_VAR_NAME":{
            return {...state, varName: action.payload}
        }
    }
    return state
}