import { halloweenGames } from '../../components/CapivaraGames/mocks/halloweenGames';
import { cheapGames } from '../../components/CapivaraGames/mocks/cheapGames';
import { earlyAccessGames } from '../../components/CapivaraGames/mocks/earlyAccessGames';
import { newGames } from '../../components/CapivaraGames/mocks/newGames';

import { List } from '../../components/CapivaraGames/List';
import { Cards } from "../../components/CapivaraGames/Cards";



export function CapivaraGames() {

    return (
        <div className="capivaraGamesMain">

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
    )
}