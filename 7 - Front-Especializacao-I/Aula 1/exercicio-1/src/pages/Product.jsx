import './Product.scss'
import { useParams } from 'react-router-dom'
import { useEffect, useState } from 'react';
import axios from "axios";
import { Card } from '../components/Card';


export function Product() {
    const { id } = useParams()
    const [productData, setProductData] = useState('');
    const [productList, setProductList] = useState('');

    useEffect(() => {
        axios.get(`https://dummyjson.com/products/${id}`).then(
            (response) => {
                setProductData(response.data);
            },
            (error) => {
                console.log(error);
            }
        )

        axios.get(`https://dummyjson.com/products`).then(
            (response) => {
                let filteredData = response.data.products.filter((item) => item.id !== Number(id)).slice(0, 4)

                setProductList(filteredData);
            },
            (error) => {
                console.log(error);
            }
        )

    }, [id])



    return (
        <section className='product-section'>
            {productData && <div className='current-product'>
                <img src={productData.thumbnail} className='thumbnail-style' />

                <div className='product-data-text'>
                    <p>{productData.title}</p>
                    <p>{productData.brand}</p>
                    <p>{productData.price.toLocaleString("pt-br", { style: "currency", currency: "BRL" })}</p>

                    <div className='description-container'>
                        <p>{productData.description}</p>
                    </div>
                </div>

            </div>
            }

            <section className='sugestion-products-section'>
                <p className='section-title'>Veja outros produtos</p>

                <section className='sugestion-products'>
                    {productList && productList.map((element, index) => (
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


        </section>

    )
}