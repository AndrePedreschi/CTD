import { halloweenGames } from '../../components/CapivaraGames/mocks/halloweenGames';
import { cheapGames } from '../../components/CapivaraGames/mocks/cheapGames';
import { earlyAccessGames } from '../../components/CapivaraGames/mocks/earlyAccessGames';
import { newGames } from '../../components/CapivaraGames/mocks/newGames';
import './style.scss'
import { List } from '../../components/CapivaraGames/List';
import { Cards } from "../../components/CapivaraGames/Cards";



export function CapivaraGames() {

    return (




        <div className="capivaraGamesMain">

            <header className='header'>
                <div className='logo'>
                    <p>Capivara Games</p>
                    <div className='imgLogo'></div>
                </div>

                <ul className='headerLinks'>
                    <li><a href="#">STORE</a></li>
                    <li><a href="#">LIBRARY</a></li>
                    <li><a href="#">COMMUNITY</a></li>
                    <li><a href="#">ABOUTY</a></li>
                    <li><a href="#">PROFILE</a></li>
                </ul>
            </header>

            <div className='banner'>
                <div className='morcego'></div>
                <div className='abobora'></div>
                <div className='card'>
                    <div className='logo'>
                        <p>Capivara Games</p>
                        <div className='imgLogo'></div>
                    </div>
                    <h1>PROMOS OU</h1>
                    <h2>DESCONTOZURAS?</h2>

                    <h3>O trocadilho é ruim mas as promoções não!</h3>
                    <h4>Aproveite as assombrosas ofertas de Halloween.</h4>
                </div>
            </div>

            <section>
                <h1>New Games</h1>
                {newGames.map((item, index) => (
                    <List
                        key={index}
                        name={item.name}
                        plataforms={item.plataforms}
                        categories={item.categories}
                        price={item.price}
                        picture={item.picture}
                    />))
                }
            </section>

            <section>
                <h1>Halloween Offers</h1>
                <div className='cards'>
                    {halloweenGames.map((item, index) => (
                        <Cards
                            key={index}
                            name={item.name}
                            categories={item.categories}
                            oldPrice={item.oldPrice}
                            newPrice={item.newPrice}
                            picture={item.picture}
                        />))
                    }
                </div>
            </section>

            <section>
                <h1>Early Access Games</h1>
                {earlyAccessGames.map((item, index) => (
                    <List
                        key={index}
                        name={item.name}
                        plataforms={item.plataforms}
                        categories={item.categories}
                        price={item.price}
                        picture={item.picture}
                    />))
                }
            </section>

            <section>
                <h1>Cheap Games</h1>
                <div className='cards'>
                    {cheapGames.map((item, index) => (
                        <Cards
                            key={index}
                            name={item.name}
                            categories={item.categories}
                            oldPrice={item.oldPrice}
                            newPrice={item.newPrice}
                            picture={item.picture}
                        />))
                    }
                </div>
            </section>
        </div>
    )
}