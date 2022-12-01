import { Link, Outlet } from 'react-router-dom'
import './style.scss'

export function MainLayout() {
    const params15 = [{ id: 1, name: 'Reportagem 1' }, { id: 2, name: 'Reportagem 2' }]

    const listaLinks = [
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
            uri: "/CapivaraGames",
            name: "Capivara Games",
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
            uri: "/IntegradoraAula13",
            name: "Integradora Aula 13",
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
            uri: "/RedeSocial",
            name: 'Rede Social JSON Placeholder',
        },
    ]




    return (
        <div className="main-layout-component">
            <header className='main-layout-component-header'>
                <h1>Layout Principal</h1>
                <ul className='listaLinks'>
                    {
                        listaLinks.map(
                            (item, index) => (
                                <li key={index}>
                                    <Link className='cardLink' to={item.uri}>{item.name}</Link>
                                </li>
                            )
                        )
                    }
                </ul>
            </header>

            <main className='main-layout-component-main'>
                <p>O conteúdo será carregado aqui dentro:</p>

                <Outlet />
            </main>

        </div>
    )

}
