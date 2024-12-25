import React, { useEffect, useState } from "react";
import Base from "../components/Base";
import {
  Button,
  Card,
  CardBody,
  CardHeader,
  Col,
  Container,
  Form,
  FormGroup,
  Input,
  Label,
  Placeholder,
  Row,
} from "reactstrap";
import { signUp } from "../services/userService";

const Signup = () => {
  const [formData, setFormData] = useState({
    name: "",
    email: "",
    password: "",
    about: "",
  });

  const [error, setError] = useState({
    errors: {},
    isError: false,
  });

  const handleChange = (e, property) => {
    // console.log(e)
    setFormData({ ...formData, [property]: e.target.value });
    console.log(formData);
  };
  const resetFormData = () => {
    setFormData({
      name: "",
      email: "",
      password: "",
      about: "",
    });
  };

  const submitForm = (e) => {
    e.preventDefault();
    console.log(formData);
    signUp(formData)
      .then((resp) => {
        console.log(resp);
        console.log("first successsss");
      })
      .catch((error) => {
        console.log(error);
        console.log("Error log");
      });
  };

  return (
    <Base>
      <Container>
        <Row>
          <Col sm={{ size: 6, offset: 3 }}>
            <Card>
              <CardHeader>
                <h3> Fill informatin to Register</h3>
              </CardHeader>
              <CardBody>
                <Form onSubmit={submitForm}>
                  <FormGroup>
                    <Label for="name">Enter Name</Label>
                    <Input
                      type="text"
                      Placeholder="Enter here"
                      id="name"
                      onChange={(e) => handleChange(e, "name")}
                      value={formData.name}
                    />
                  </FormGroup>
                  <FormGroup>
                    <Label for="email">Enter Email</Label>
                    <Input
                      type="email"
                      Placeholder="Enter here"
                      id="email"
                      onChange={(e) => handleChange(e, "email")}
                      value={formData.email}
                    />
                  </FormGroup>
                  <FormGroup>
                    <Label for="password">Enter Name</Label>
                    <Input
                      type="password"
                      Placeholder="Enter here"
                      id="password"
                      onChange={(e) => handleChange(e, "password")}
                      value={formData.password}
                    />
                  </FormGroup>
                  <FormGroup>
                    <Label for="about">Enter About</Label>
                    <Input
                      type="textarea"
                      Placeholder="Enter here"
                      id="about"
                      onChange={(e) => handleChange(e, "about")}
                      value={formData.about}
                    />
                  </FormGroup>
                  <Container className="text-center">
                    <Button color="dark">Register</Button>
                    <Button
                      onClick={resetFormData}
                      type="reset"
                      className="ms-2"
                      color="secondary"
                    >
                      Reset
                    </Button>
                  </Container>
                </Form>
              </CardBody>
            </Card>
          </Col>
        </Row>
      </Container>
    </Base>
  );
};

export default Signup;
