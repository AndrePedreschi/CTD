import './style.scss'
import { useState, useEffect } from "react";

export function IntegradoraAula13(){

    const [pedido, setPedido] = useState('')

    useEffect(() => {

        setTimeout(() => {

            setPedido('Pizzas')    

        }, 2000)

    }, [pedido])
    
    function cancelarPedido(){

        setPedido('')

        alert('Seu pedido foi cancelado')
    }

    return (
        <div>
            <p>Seu Pedido: {pedido}</p>
            <button onClick={()=>cancelarPedido()}>Cancelar Pedido</button>
        </div>
    )

}