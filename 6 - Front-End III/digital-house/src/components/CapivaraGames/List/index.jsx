import './style.scss';
import  windows  from '../../../assets/icons/windows.png'
import  mac  from '../../../assets/icons/mac.png'

export function List({ name, plataforms, categories, price, picture }) {

    return (
        <div className="listMain">

            <img src={picture} className="imgStyle" />

            <div className='detailsStyle'>
                <h1 className='nameStyle'>{name}</h1>

                <div className='plataformPriceStyle'>
                    <div className="plataformsStyle">
                        {/* <p>{plataforms}</p> */}
                        <img src={ windows } />
                    </div>
                    <p className="priceStyle">{price}</p>
                </div>

                <div className="categoriesStyle">
                    {categories.map(item => (
                        <p>{item+", "}</p>
                    ))}
                </div>


            </div>

        </div>
    )
}