import { useEffect, useState } from 'react';
import axios from "axios";
import { Card } from '../components/Card';
import './Home.scss'
export function Home() {

    const [products, setProducts] = useState([])

    useEffect(() => {
        axios.get(`https://dummyjson.com/products`).then(
            (response) => {
                setProducts(response.data.products);
            },
            (error) => {
                console.log(error);
            }
        )

    }, [])

    return (
        <section className='home-section'>

            <section className='products'>
                {products && products.map((element, index) => (
                    <Card 
                    key={index}
                    id={element.id}
                    thumbnail={element.thumbnail}
                    title={element.title}
                    brand={element.brand}
                    price={element.price}
                    />
                ))}
            </section>
        </section>
    )
}