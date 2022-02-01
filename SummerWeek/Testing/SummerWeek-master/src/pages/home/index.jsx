import './home.css'
import { useState, useEffect, useContext } from 'react'
import { Container, Row, Col, Modal, Button, Form, Tabs, Tab } from 'react-bootstrap'
import MovieCard from '../../components/card'
import { FavoritesContext } from '../../providers/favorites'
import api from '../../services/api'

export default function Home() {

    const { favorites } = useContext(FavoritesContext)

    const [movies, setMovies] = useState([])
    const [modalVisibility, setModalVisibility] = useState(false)
    const [modalEdit, setModalEdit] = useState(false)
    const [currentMovie, setCurrentMovie] = useState({})
    const [imageField, setImageField] = useState('')
    const [titleField, setTitleField] = useState('')
    const [descriptionField, setDescriptionField] = useState('')

    function getMovies() {

        api.get(`/filme`).then(

            success => setMovies(success.data)

        ).catch(

            error => console.log(error)

        )

    }


    useEffect(() => {

        getMovies()

    }, [])



    function setDataModal(movie, isEdition) {

        setModalVisibility(true)
        setModalEdit(isEdition)

        if (movie === '') {

            setImageField('')
            setTitleField('')
            setDescriptionField('')

        } else {

            setImageField(movie.urlImg)
            setTitleField(movie.titulo)
            setDescriptionField(movie.descricao)

        }

    }



    function saveMovie(movie) {

        let formData = {
            urlImg: imageField,
            titulo: titleField,
            descricao: descriptionField
        }

        if (modalEdit) {

            // editar filme

            formData.id = currentMovie.id

            api.put('/filme', formData).then(

                response => {

                    getMovies()
                    setModalVisibility(false)

                }

            ).catch(

                error => console.log(error)

            )

        } else {

            // cadastrar filme

            api.post('/filme', formData).then(

                response => {

                    getMovies()
                    setModalVisibility(false)

                }

            ).catch(

                error => console.log(error)

            )

        }

    }



    function deleteMovie(id) {

        api.delete(`/filme/${id}`).then(

            response => {

                getMovies()
                setModalVisibility(false)

            }

        ).catch(

            error => console.log(error)

        )

    }



    return (
        <>

            <Modal show={modalVisibility} onHide={() => setModalVisibility(false)}>
                <Modal.Header closeButton>
                    <Modal.Title>{modalEdit ? 'Editar' : 'Cadastrar'} Filme</Modal.Title>
                </Modal.Header>
                <Modal.Body>

                    <Form>

                        {/* <img className='preview' src={imageField} /> */}

                        <Form.Group className="mb-3" controlId="formUrl">
                            <Form.Label>Imagem</Form.Label>
                            <Form.Control type="text" value={imageField} placeholder="Adicione uma URL" onChange={change => setImageField(change.target.value)} />
                            <Form.Text className="text-muted">
                                Essa imagem será exibida no Card do filme.
                            </Form.Text>
                        </Form.Group>

                        <Form.Group className="mb-3" controlId="formTitle">
                            <Form.Label>Título</Form.Label>
                            <Form.Control type="text" value={titleField} placeholder="Título do Filme" onChange={change => setTitleField(change.target.value)} />
                        </Form.Group>

                        <Form.Group className="mb-3" controlId="formDescription">
                            <Form.Label>Descrição</Form.Label>
                            <Form.Control as="textarea" value={descriptionField} rows={3} placeholder="Breve descrição sobre o Filme" onChange={change => setDescriptionField(change.target.value)} />
                        </Form.Group>
                    </Form>

                </Modal.Body>
                <Modal.Footer>
                    {
                        modalEdit &&
                        <Button variant="danger" onClick={() => deleteMovie(currentMovie.id)}>
                            Deletar
                        </Button>
                    }
                    <Button variant="success" onClick={() => saveMovie(false)}>
                        Salvar
                    </Button>
                </Modal.Footer>
            </Modal>

            <header className='main-header'>
                <img src="https://www.digitalhouse.com/logo-DH.png" />
            </header>
            <main className='main-content'>

                <Tabs defaultActiveKey="all" id="uncontrolled-tab-example" className="mb-3 tabs">
                    <Tab eventKey="all" title="Todos">

                        <Container>
                            <Row>
                                {
                                    movies.map(movie => {

                                        return (
                                            <Col sm={12} md={4} key={movie.id}>
                                                <MovieCard
                                                    movie={movie}
                                                    favorited={favorites.find(item => item.id === movie.id)}
                                                    openDetails={movie => {
                                                        setCurrentMovie(movie)
                                                        setDataModal(movie, true)
                                                    }}
                                                />
                                            </Col>
                                        )

                                    })
                                }
                            </Row>
                        </Container>

                    </Tab>
                    <Tab eventKey="favorites" title={`Favoritos ${favorites.length}`}>

                        <Container>
                            <Row>
                                {
                                    favorites.length === 0 ? (

                                        <div className='not-found-container'>
                                            <span className="material-icons-outlined">search_off</span>
                                            <h1>Nenhum filme foi encontrado</h1>
                                            <p>Favorite algum filme para que ele possa aparecer nessa listagem</p>
                                        </div>

                                    ) : (

                                        favorites.map(movie => {

                                            return (
                                                <Col sm={12} md={4} key={movie.id}>
                                                    <MovieCard
                                                        movie={movie}
                                                        favorited={true}
                                                        openDetails={movie => {
                                                            setDataModal(movie, true)
                                                        }}
                                                    />
                                                </Col>
                                            )

                                        })

                                    )
                                }
                            </Row>
                        </Container>

                    </Tab>
                </Tabs>

            </main>
            <Button className='fab' variant="success" onClick={() => {
                setDataModal('', false)
            }}>
                <span className="material-icons-outlined">add</span>
            </Button>
        </>
    )

}