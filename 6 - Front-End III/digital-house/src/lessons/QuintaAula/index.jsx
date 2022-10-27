import './style.scss'
import youtubeImage from './../../assets/images/meme-gif-pfp-1.gif'
import { QuintaAulaItem } from '../../components/QuintaAulaItem'

export function QuintaAula() {


    const componetsFinded = [
        {
            id: 1,
            title: 'Vídeo Component',
            image: youtubeImage,
            text: 'Lorem ipsum dolor sit amet'
        },
        {
            id: 2,
            title: 'Input Component',
            image: youtubeImage,
            text: 'Lorem ipsum dolor sit amet'
        },
        {
            id: 3,
            title: 'Button Component',
            image: youtubeImage,
            text: 'Lorem ipsum dolor sit amet'
        },
    ]
    return (
        <div className='quarta-aula-component'>
            
            <h1 className='main-title'>Componentes identificados</h1>

            <ul className='conponents-finded'>
                {componetsFinded.map((component) => (
                    <QuintaAulaItem dados={component} />
                ))}
            </ul>
        </div>
    )


}