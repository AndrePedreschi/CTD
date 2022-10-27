import './style.scss'

export function QuartaAulaItem({index, image, title, text}) {
    return (
        <li key={index}>
            <img src={image}/>
            <h1>{title}</h1>
            <p>{text}</p>
        </li>
    )
}