import './style.scss'
import { useState, useEffect } from "react";

import { Link, Navigate, Outlet } from 'react-router-dom'


export function JsonPlaceholder() {


    const [usuarios, setUsuarios] = useState([])
    const [usuarioSelected, setUsuarioSelected] = useState(0)
    const [error, setError] = useState(false)


    /* inicia com todas as postagens
        tenho um "Logar" com os nomes dos usuários
        com o usuário logado, habilito o header com as 
        opções de posts e albuns ou ja inicio com os posts 
        e deixo somente o album no header? */


    //lista dos usuários
    useEffect(() => {
        fetch(`https://jsonplaceholder.typicode.com/users`).then(
            response => {
                response.json().then(
                    usuariosList => {
                        console.log(usuariosList);
                        setUsuarios(...usuarios, usuariosList)


                    }

                )
            }
        )
    }, [])

    useEffect(() => {

        //let teste = JSON.stringify(usuarioSelected)
        //console.log(teste);
        //<Link to={`/RedeSocial/Post/${usuarioSelected}`}>teste </Link>
    }, [usuarioSelected])



    return (
        <div>
            <header>
                <h1>Usuário:</h1>

                <select value={usuarioSelected} onChange={event => setUsuarioSelected(event.target.value)}>
                    <option defaultChecked value=''>Selecione um Usuário</option>
                    {usuarios.map((item, index) => (
                        <option key={index} value={item.id}>{item.name} </option>
                    ))}
                </select>

                {usuarioSelected > 0 && <Link to={`/RedeSocial/Post/${usuarioSelected}`}><button>Conectar com o usuário {usuarios[usuarioSelected-1].name}</button></Link>}
            </header>
            

            <main>
            < Outlet />
                
            </main>

        </div>
    )
}