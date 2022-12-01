import { useState, useEffect } from 'react'
import { DecimaQuintaAulaItem } from '../../components/DecimaQuintaAulaItem'
import { Link, useParams } from 'react-router-dom'
import './style.scss'

export function DecimaQuintaAula() {

    const [styleError, setStyleError] = useState({})
    const [locations, setLocations] = useState([])
    const [erroForm, setErroForm] = useState(false)
    const [cep, setCep] = useState('')

    //Recebendo o parametro d url
    const { id } = useParams()
    console.log(id);

    function limparForm() {
        setCep('')
    }

    function searchCep(evento) {
        evento.preventDefault();

        fetch(`https://viacep.com.br/ws/${cep}/json/`).then(
            response => {
                response.json().then(
                    address => {
                        if (address.erro !== undefined) {
                            //console.log("Deu erro");
                            alert("Digite um CEP válido!")
                        } else {
                            //console.log("Deu sucesso");
                            setLocations([...locations, address])
                        }
                    }
                )
            }
        )
        limparForm()
    }

    useEffect(() => {

        if(cep.length>8){
            setCep(
                cep.slice(0,8)
            )
        }



        if (cep.length == 8) {
            let cepReconstruido = `${cep.slice(0, 5)}-${cep.slice(5)}`
            if (locations.filter(item => item.cep == cepReconstruido).length > 0) {
                alert("CEP já cadastrado")
                setErroForm(false)
            } else {
                setErroForm(true)
            }
        } else {
            setErroForm(false)
        }
    }, [cep])


    function deleteLocation(currentLocation) {
        setLocations(
            locations.filter(item => item.cep !== currentLocation.cep)
        )
    }

    /* function style() {
        const style1 = {
            backgroundColor: '#ff00001f',
            border: `1px solid #ff0000`
        }
        const style2 = {
            backgroundColor: `#303030`,
            border: `none`
        }

        let cepReconstruido = `${cep.slice(0, 5)}-${cep.slice(5)}`

        if (locations.filter(item => item.cep == cepReconstruido).length > 0) {
            console.log("style 1");
            return style1
        } else {
            console.log("style 2");
            return style2
        }
    } */

    return (
        <div className="decima-quarta-aula-component">
            <form >
                <h1>Cadastrar endereços {id}</h1>
                <div>
                    <label>Cep</label>
                    <input
                        type="number"
                        value={cep}
                        aria-label='cep'
                        onChange={event => setCep(event.target.value)}
                    />
                </div>
                <button disabled={!erroForm} onClick={(event) => searchCep(event)}>Cadastrar</button>

            </form>

            <section className="locations">
                {
                    locations.map(
                        (location, index) => (
                            <DecimaQuintaAulaItem
                                key={index}
                                data={location}
                                style={() => style()}
                                onDeleteLocation={(currentLocation) => deleteLocation(currentLocation)}
                            />
                        )

                    )
                }
            </section>


            <Link to="/DecimaQuartaAula">
                <button>Aula Anterior</button>
            </Link>

        </div>

    )

}