import React from "react";
import Base from "../components/Base";
import { Button, Card, CardBody, CardHeader, Col, Container, Form, FormGroup, Input, Label, Row } from "reactstrap";

const Login = () => {
  return (
    <Base>
      <Container>
        <Row>
          <Col sm={{ size: 6, offset: 3 }}>
            <Card>
              <CardHeader>
                <h3>Login Here</h3>
              </CardHeader>
              <CardBody>
                <Form>
                  <FormGroup>
                    <Label for="email">Enter Email</Label>
                    <Input type="email" Placeholder="Enter here" id="email" />
                  </FormGroup>
                  <FormGroup>
                    <Label for="password">Enter Password</Label>
                    <Input
                      type="password"
                      Placeholder="Enter here"
                      id="password"
                    />
                  </FormGroup>
                  <Container className="text-center">
                    <Button color="dark">Login</Button>
                    <Button type="reset" className="ms-2" color="secondary">
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

export default Login;
