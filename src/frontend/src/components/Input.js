import React from "react";

const Input = (props) => {
    const {label, error, name, onChange, type, defaultValue} = props;
    let className = "form-control";
    if (type === "file")
        className += "-file";
    if(error!==undefined)
        className+=" is-invalid";
    return (
        <div className="form-group">
            <label>{label}</label>
            <input className={className} type={type} name={name} defaultValue={defaultValue}
<<<<<<< HEAD
                   onChange={onChange}/>
=======
                   onChange={onChange}
                    autoComplete="off"
            />
>>>>>>> d41ad07... developed like system
            <div className="invalid-feedback">
                {error}
            </div>
        </div>
    );
}
export default Input;