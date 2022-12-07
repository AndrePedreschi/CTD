import './style.scss'

export function Cards({ name, categories, oldPrice, newPrice, picture, key }) {
    console.log(categories);


    return (
        <a href={key} className="cardsMain">
            <img src={picture} className="imgStyle" />

            <div className='interno'>
                <div className="dados">
                    <h1>{name}</h1>
                    <p>{categories}</p>
                </div>

                <div className="preco">
                    <p>{oldPrice}</p>
                    <h1>{newPrice}</h1>
                </div>
            </div>

        </a>
    )
}