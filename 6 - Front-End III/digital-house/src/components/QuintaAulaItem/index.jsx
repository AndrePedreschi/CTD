import './style.scss'

export function QuintaAulaItem(props) {
    //console.log(props);
    return (
        <li key={props.dados.id}>
            <img src={props.dados.image} />
            <h1>{props.dados.title}</h1>
            <p>{props.dados.text}</p>
        </li>
    )
}