import './style.scss'
import { useState } from 'react'
import { SetimaAulaCardProduto } from "../../components/SetimaAulaCardProduto"

export function OitavaAula() {

    // const [temaEscuro, setTemaEscuro] = useState(true)

    // const [contador, setContador] = useState(0)


    // function somarNumero(numero){
    //     //setContador(prev=>({...prev, contador: contador+1}))
    //     setContador(contador+numero)
    // }

    // function mudarTema(){
    //     setTemaEscuro(!temaEscuro)
    // }

    const newProducts = [
        {
            id: 1,
            name: 'Xbox',
            price: '3.000',
            picture: 'https://http2.mlstatic.com/D_NQ_NP_695945-MLB50098260025_052022-O.webp'
        },
        {
            id: 2,
            name: 'Playstation 5',
            price: '5.000',
            picture: 'https://http2.mlstatic.com/D_NQ_NP_841787-MLA44484414455_012021-O.webp'
        },
        {
            id: 3,
            name: 'Switch',
            price: '2.000',
            picture: 'https://http2.mlstatic.com/D_NQ_NP_771705-MLA40692342174_022020-W.webp'
        }
    ]

    const newProduct = {
        id: 4,
        name: 'Playstation 4',
        price: '2.000',
        picture: 'https://http2.mlstatic.com/D_NQ_NP_798586-MLA40076060236_122019-W.webp'
    }


    const [allProducts, setAllProducts] = useState(newProducts);
    const [nomeProduto, setNomeProduto] = useState('');
    const [precoProduto, setPrecoProduto] = useState('');
    const [fotoProduto, setFotoProduto] = useState('');
    const [formularioErro, setFormularioErro] = useState(false);



    function addNewProduct() {
        setAllProducts([...allProducts, newProduct])
    }

    function limparFormulario() {
        setNomeProduto('')
        setPrecoProduto('')
        setFotoProduto('')
        setFormularioErro(false)
    }

    function cadastrarProduto(evento) {
        evento.preventDefault();

        if (nomeProduto.length <= 4) {
            setFormularioErro(true)
            
        }else if (precoProduto.length <= 4) {
            setFormularioErro(true)
            
        } else if (fotoProduto.length <= 4) {
            setFormularioErro(true)
            
        }



        if (formularioErro) {
            // setFormularioErro(false)
            //  limparFormulario();
            console.log("oi");

        } else {
            console.log("entrou os dados errados");
            const novoProtutoCadastrado = {
                name: nomeProduto,
                price: precoProduto,
                picture: fotoProduto,
            }
            setAllProducts([...allProducts, novoProtutoCadastrado]);

            
            limparFormulario();
        }


    }



    return (

        <main className="setima-aula-component">

            <div className="tittle-wrapper">
                <h1>Produtos</h1>
                <button onClick={addNewProduct}>Adicionar novo produto</button>
            </div>

            <form onSubmit={event => cadastrarProduto(event)} className={formularioErro ? 'form-erro' : ''}>
                <div>
                    <label htmlFor="nomeProduto">Nome produto</label>
                    <input id='nomeProduto' type="text" value={nomeProduto} onChange={event => setNomeProduto(event.target.value)} />
                </div>

                <div>
                    <label htmlFor="precoProduto">Preço</label>
                    <input id='precoProduto' type="text" value={precoProduto} onChange={event => setPrecoProduto(event.target.value)} />
                </div>

                <div>
                    <label htmlFor="fotoProduto">Foto</label>
                    <input id='fotoProduto' type="text" value={fotoProduto} onChange={event => setFotoProduto(event.target.value)} />
                </div>


                {/* <button type='submit' onClick={event => cadastrarProduto(event)}>Cadastrar Produto</button> */}
                <button type='submit'>Cadastrar Produto</button>
            </form>

            <section className='products'>
                {
                    allProducts.map(
                        (product, index) => {
                            return (
                                <SetimaAulaCardProduto key={index}
                                    productData={product}
                                />
                            )
                        }
                    )
                }
            </section>

        </main>
    )
}