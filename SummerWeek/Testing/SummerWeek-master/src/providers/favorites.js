import { createContext } from 'react'
import useLocalStorage from '../hooks/useLocalStorage'

export const FavoritesContext = createContext([])

export const FavoritesProvider = props => {

    const [favorites, setFavorites] = useLocalStorage('favoritesMovies', [])

    return (

        <FavoritesContext.Provider value={{favorites, setFavorites}}>
            { props.children }
        </FavoritesContext.Provider>

    )

}