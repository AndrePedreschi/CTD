import './style.scss'
import { useState, useEffect } from "react";
import { Link, useParams } from 'react-router-dom'

export function JsonPlaceholderPostItem() {
    const [posts, setPosts] = useState([])
    const [albuns, setAlbuns] = useState([])
    const [lista, setLista] = useState([])

    const { id } = useParams()


    //console.log(id);

    // /users/1/albums
    // /albums/1/photos

    // /users/1/posts
    // /posts/1/comments

    //lista de todas as postagens
    // useEffect(() => {
    //     fetch(`https://jsonplaceholder.typicode.com/posts`).then(
    //         response => {
    //             response.json().then(
    //                 postList => {
    //                     setPosts([...posts, postList])

    //                 }
    //             )
    //         }
    //     )
    // }, [])


    function listarPostagens() {
        fetch(`https://jsonplaceholder.typicode.com/users/${id}/posts`).then(
            response => {
                response.json().then(
                    postList => {
                        setPosts(postList)
                        setAlbuns([])
                    }
                )
            }
        )
    }

    function listarAlbuns() {
        fetch(`https://jsonplaceholder.typicode.com/users/${id}/albums`).then(
            response => {
                response.json().then(
                    albumList => {
                        setAlbuns(albumList)
                        setPosts([])
                    }
                )
            }
        )
    }


    useEffect(() => {

        if (posts.length > 0) {
            setLista(posts)
        } else if (albuns.length > 0) {
            setLista(albuns)
        }

    }, [albuns, posts])

    useEffect(() => {
        console.log(lista);
    }, [lista])

    return (
        <div>
            {/* <h1>Post id: {id}</h1> */}

            <h1>Atividades:</h1>
            <div className='buttonBox'>

                <button onClick={listarPostagens}>Posts do Usuário</button>
                <button onClick={listarAlbuns}>Albuns do Usuário</button>
            </div>

            {lista.map((item, index) => (


                <Link to={'/RedeSocial/'} key={index}>
                    <h1>{item.title}</h1>
                    <p>{item.body}</p>
                </Link>





            ))}

        </div>

    )
}