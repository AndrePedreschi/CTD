import './style.scss'
import { componetsFinded } from './../../components/QuartaAulaLista'
import { QuartaAulaItem } from '../../components/QuartaAulaItem'

export function QuartaAula() {

    return (
        <div className='quarta-aula-component'>
            <h1 className='main-title'>Componentes identificados</h1>
            <ul className='conponents-finded'>

                {componetsFinded.map((component, index) =>( 
                    <QuartaAulaItem 
                    image={component.image} 
                    title={component.title} 
                    text={component.text}
                    index={index} />
                ))}

            </ul>
        </div>
    )

}