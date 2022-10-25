import './style.scss'
import meme1 from './../../assets/images/meme-gif-pfp-1.gif'


export function TerceiraAula() {

    const components = [
        { name: 'Component Card 1', description: 'teste', image: meme1 },
        { name: 'Component Card 2', description: 'teste', image: meme1 },
        { name: 'Component Card 3', description: 'teste', image: meme1 },
        { name: 'Component Card 4', description: 'teste', image: meme1 },
        { name: 'Component Card 5', description: 'teste', image: meme1 },
    ]

    return (
        <div className='div3'>
            <h1>Lista de componentes encontrados em um sistema</h1>

            <ul>
                {
                    components.map((component) => (
                        <li>
                            <img src={component.image} />
                            <h1>{component.name}</h1>
                            <p>{component.description}</p>
                        </li>
                    ))
                }

            </ul>
        </div>
    )
}