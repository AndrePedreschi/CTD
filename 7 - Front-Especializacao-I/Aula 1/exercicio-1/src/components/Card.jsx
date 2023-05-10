import './Card.scss'
import { Link } from "react-router-dom";


export function Card({ brand, title, price, thumbnail, id }) {


    return (
        <Link to={`/product/${id}`} className='card-section' >
            <img src={thumbnail} alt="thumbnail" className='thumbnail-style' />
            <div className='product-data-text'>
                <p>{title}</p>
                <p>{brand}</p>
                <p>{price.toLocaleString("pt-br", { style: "currency", currency: "BRL" })}</p>
            </div>
        </Link>
    )
}