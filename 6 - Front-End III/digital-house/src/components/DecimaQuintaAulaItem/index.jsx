import './style.scss'

export function DecimaQuintaAulaItem(props) {

    /* function style(){
        const style1 = {
            backgroundColor: `${props.style.backgroundColor}`,
            border: `1px solid ${props.style.border}`
        }
        const style2 = {
            backgroundColor: `#303030`,
            border: `none`
        }
        setTimeout(style1,2000)

    } */
    
    //console.log(props.data.style);

    return(
        <div className="decima-quinta-aula-item" >
            <h1>{props.data.logradouro}</h1>
            <address>{props.data.logradouro}, {props.data.bairro} - {props.data.localidade}({props.data.uf})</address>
            <small>{props.data.cep}</small>
            <button onClick={()=> props.onDeleteLocation(props.data)}>Deletar</button>
        </div>
    )

}