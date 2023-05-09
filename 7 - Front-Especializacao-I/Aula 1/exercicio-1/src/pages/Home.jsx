import { useEffect, useState } from 'react';
import axios from "axios";
import { Card } from '../components/Card';

export function Home() {

    const [products, setProducts] = useState([])

    /* useEffect(() => {
        axios.get(`https://dummyjson.com/products`).then(
            (response) => {
                setProducts(JSON.parse(response.data));

                console.log(JSON.parse(response.data));
            },
            (error) => {
                //if (error.status == 404) return toast.error('Usuário não encontrado');
                if (error.code === 'ERR_NETWORK') return toast.error('Ocorreu um erro, por favor recarregue a página.');
            }
        )

    }, []) */

    return (
        <section className='home-section'>

            <section className='products'>
{products && products.map((element, index)=> (
    <Card />
))}
            </section>
        </section>
    )
}