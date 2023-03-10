import { Link, Outlet } from 'react-router-dom'
import './style.scss'

import { useConfig } from '../../hooks/useConfigurations'


export function MainLayout() {
    let contents = {
        english: {},
        portuguese: {},
    }

    // Importação do Tema utilização o Hook customizado "useTheme"
    
    const { config } = useConfig()

    const params15 = [{ id: 1, name: 'Reportagem 1' }, { id: 2, name: 'Reportagem 2' }]

    const listaAulas = [
        {
            uri: "/Login",
            name: "Login",
        },
        {
            uri: "/SegundaAula",
            name: "Segunda Aula",
        },
        {
            uri: "/TerceiraAula",
            name: "Terceira Aula",
        },
        {
            uri: "/QuartaAula",
            name: "Quarta Aula",
        },
        {
            uri: "/QuintaAula",
            name: "Quinta Aula",
        },
        {
            uri: "/SetimaAula",
            name: "Setima Aula",
        },
        {
            uri: "/OitavaAula",
            name: "Oitava Aula",
        },
        {
            uri: "/DecimaTerceiraAula",
            name: "Decima Terceira Aula",
        },
        {
            uri: "/DecimaQuartaAula",
            name: "Decima Quarta Aula",
        },
        {
            uri: "/DecimaQuintaAula",
            name: "Decima Quinta Aula",
        },
        {
            uri: `/DecimaQuintaAula/${params15[0].id}`,
            name: 'Reportagem 1',
        },
        {
            uri: `/DecimaQuintaAula/${params15[1].id}`,
            name: 'Reportagem 2',
        },
        {
            uri: "/vigesima-quarta-aula",
            name: "Vigesima Quarta Aula",
        },
    ]

    const listaTelas = [
        {
            uri: "/Login",
            name: "Login",
        },
        {
            uri: "/CapivaraGames",
            name: "Capivara Games",
        },
        {
            uri: "/IntegradoraAula13",
            name: "Integradora Aula 13",
        },
        {
            uri: "/RedeSocial",
            name: 'Rede Social JSON Placeholder',
        },
        {
            uri: "/to-do",
            name: 'To-Do',
        },
        {
            uri: "/Configurations",
            name: 'Configurações',
        },
    ]




    return (
        <div className={`main-layout-component ${config.theme}`}>
            <header className='main-layout-component-header'>
            <Link to={''}><h1>Front-end III - React</h1></Link> 
            </header>

            <aside className='main-layout-component-aside'>
                <section>
                    <h1>Aulas</h1>
                    <ul className='listaAulas'>
                        {
                            listaAulas.map(
                                (item, index) => (
                                    <li key={index}>
                                        <Link className='cardLink' to={item.uri}>{item.name}</Link>
                                    </li>
                                )
                            )
                        }
                    </ul>
                </section>
                <section>
                    <h1>Telas</h1>
                    <ul>
                        {
                            listaTelas.map(
                                (item, index) => (
                                    <li key={index}>
                                        <Link className='cardLink' to={item.uri}>{item.name}</Link>
                                    </li>
                                )
                            )
                        }
                    </ul>
                </section>
            </aside>

            <main className='main-layout-component-main'>
                <Outlet />
            </main>
        </div>
    )
}
