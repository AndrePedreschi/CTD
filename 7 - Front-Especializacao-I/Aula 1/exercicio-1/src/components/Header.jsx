import "./Header.scss"
import { Link } from "react-router-dom";

export function Header(){
    return(
        <section className="header-section">
            <Link to={`home`} className="link-style">Shop Products</Link>
        </section>
    )
}